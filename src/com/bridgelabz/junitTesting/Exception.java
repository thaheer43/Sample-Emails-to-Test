package com.bridgelabz.junitTesting;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

class CustomException extends Exception {
	public CustomException(String message) {
		super(message);
	}

	public static class CheckPattern {

		static final Pattern names = Pattern.compile("^[A-Z][a-z]{3,}$");
		static final Pattern email = Pattern
				.compile("^[a-zA-Z]+[a-zA-Z0-9]*[- . + _]?[a-zA-Z0-9]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$");
		static final Pattern phone = Pattern.compile("[0-9]{2}[0-9]{10}$");
		static final Pattern password = Pattern
				.compile("^([a-zA-Z0-9]*[\\-\\!\\@\\#\\$\\%\\^\\&\\*\\(\\)\\_\\+]*){8,}$");

		public static boolean check(String inputs) throws CustomException {
			Matcher matcher = names.matcher(inputs);
			if (matcher.matches())
				return names.matcher(inputs).matches();
			else
				throw new CustomException(inputs + "Invalid input");
		}

		public static boolean mail(String mail) throws CustomException {
			Matcher matcher = email.matcher(mail);
			if (matcher.matches())
				return email.matcher(mail).matches();
			else
				throw new CustomException(mail + "Invalid input");
		}

		public static boolean mobile(String mobile) throws CustomException {
			Matcher matcher = phone.matcher(mobile);
			if (matcher.matches())
				return phone.matcher(mobile).matches();
			else
				throw new CustomException(mobile + "Invalid input");
		}

		public static boolean passwords(String pass) throws CustomException {
			Matcher matcher = password.matcher(pass);
			if (matcher.matches())
				return password.matcher(pass).matches();
			else
				throw new CustomException(pass + "Invalid input");
		}
	}

}