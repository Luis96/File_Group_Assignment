package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.google.gson.Gson;

import java.awt.Button;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyGdxGame extends ApplicationAdapter
{
	private Button button;
	private TextureAtlas buttonTexture;
	private Skin buttonSkin;
	private Stage stage;

	public void create()
	{
		setResources();

		loadData();
	}

	private void loadData()
	{
		FileHandle questionsFileName = Gdx.files.internal("data/GetQuestions.json");
		FileHandle answersFileName = Gdx.files.internal("data/GetAnswers.json");

		String questionFileToRead = questionsFileName.readString();
		String answerFileToRead = answersFileName.readString();

		Question[] questionArray = new Gson().fromJson(questionFileToRead, Question[].class);
		Answer[] answerArray = new Gson().fromJson(answerFileToRead, Answer[].class);

		Singleton.getInstance().setQuestions(questionArray);
		Singleton.getInstance().setAnswers(answerArray);

		List<Question> questionList = Arrays.asList(questionArray);

		Collections.shuffle(questionList);

		System.out.println("Unsorted Questions:");

		for(Question question : questionList)
		{
			System.out.println("\tQuestion ID: " + question.getQuestionId() + "\n" +
					"\tQuestion Priority: " + question.getQuestionPriority() + "\n" +
					"\tQuestion Description: " + question.getQuestionDescription());
		}

		Collections.sort(questionList, new Comparator<Question>()
		{
			public int compare(Question questionA, Question questionB)
			{
				if(questionA.getQuestionPriority().getIntegerValue() == questionB.getQuestionPriority().getIntegerValue())
				{
					return questionA.getQuestionId();
				}

				return questionA.getQuestionPriority().getIntegerValue() > questionB.getQuestionPriority().getIntegerValue()
						? 1 : questionA.getQuestionPriority().getIntegerValue() < questionB.getQuestionPriority().getIntegerValue() ? -1 : 0;
			}
		});

		System.out.println("Sorted Questions:");

		for(Question question : questionList)
		{
			System.out.println("\tQuestion ID: " + question.getQuestionId() + "\n" +
					"\tQuestion Priority: " + question.getQuestionPriority() + "\n" +
					"\tQuestion Description: " + question.getQuestionDescription());
		}
	}

	private void setResources()
	{
		stage = new Stage();

		buttonSkin = new Skin();
	}
}