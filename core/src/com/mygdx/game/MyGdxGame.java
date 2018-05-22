package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyGdxGame extends ApplicationAdapter
{
	public void create()
	{
		loadData();
	}

	private void loadData()
	{
		//InputStream questionStream = Gdx.files.internal("Assets/Data/GetQuestions.json");
		//String jsonQuestions = readStream();
		String jsonQuestions = getJsonData("http://www.json-generator.com/api/json/get/cknCqaXNnS?indent=2\n");
		String jsonAnswers = getJsonData("http://www.json-generator.com/api/json/get/bUjeqTPtpe?indent=2\n");

		System.out.println("Question List: " + jsonQuestions);
		System.out.println("Answer List: " + jsonAnswers);

		Question[] questionArray = new Gson().fromJson(jsonQuestions, Question[].class);
		Answer[] answerArray = new Gson().fromJson(jsonAnswers, Answer[].class);

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

	private String getJsonData(final String urlLocation)
	{
		HttpURLConnection connection = null;

		try
		{
			URL url = new URL(urlLocation);

			connection = (HttpURLConnection) url.openConnection();

			return readStream(connection.getInputStream());
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
		finally
		{
			connection.disconnect();
		}

		return null;
	}

	private String readStream(InputStream inputStream)
	{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
		StringBuilder getData = new StringBuilder();
		String readLine = null;

		try
		{
			while((readLine = bufferedReader.readLine()) != null)
			{
				getData.append(readLine).append('\n');
			}
		}
		catch(IOException exception)
		{
			exception.printStackTrace();
		}

		return getData.toString();
	}
}