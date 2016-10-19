package com.dev.frontend.intg.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IntgClient {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(IntgClient.class);

	public static String get(String urlText) {
		StringBuilder output = new StringBuilder();
		try {

			URL url = new URL(urlText);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");

			LOGGER.info("urlText is {}", urlText);

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(
					(conn.getInputStream())));

			LOGGER.info("Output from Server ....");
			String readLine;
			while ((readLine = br.readLine()) != null) {
				output.append(readLine);
			}
			LOGGER.info(output.toString() + "\n");

			conn.disconnect();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return output.toString();
	}

	public static String delete(String urlText) {
		StringBuilder output = new StringBuilder();
		try {

			URL url = new URL(urlText);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("DELETE");
			conn.setRequestProperty("Accept", "application/json");

			LOGGER.info("urlText is {}", urlText);

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(
					(conn.getInputStream())));

			LOGGER.info("Output from Server ....");
			String readLine;
			while ((readLine = br.readLine()) != null) {
				output.append(readLine);
			}
			LOGGER.info(output.toString() + "\n");

			conn.disconnect();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return output.toString();
	}

	public static String post(String urlText, String input) {
		StringBuilder output = new StringBuilder();
		try {

			URL url = new URL(urlText);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/json");

			OutputStream os = conn.getOutputStream();
			os.write(input.getBytes());
			os.flush();

			LOGGER.info("urlText is {}", urlText);
			LOGGER.info("input is {}", input);

			if (conn.getResponseCode() != HttpURLConnection.HTTP_CREATED) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(
					(conn.getInputStream())));

			String readLine;
			LOGGER.info("Output from Server ....");
			while ((readLine = br.readLine()) != null) {
				output.append(readLine);
			}
			LOGGER.info(output.toString() + "\n");

			conn.disconnect();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return output.toString();
	}

}