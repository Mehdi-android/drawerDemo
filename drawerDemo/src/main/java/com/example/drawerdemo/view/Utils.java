package com.example.drawerdemo.view;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.ConnectivityManager;

public class Utils {

	// public static String URL_SERVER_ADDRESS =
	// "http://108.163.162.132/Gendertimer/";
	public static String URL_SERVER_ADDRESS = "http://108.163.162.134/Gendertimer/";
	public static String REGISTER = "user_register.php";
	public static String LOGIN = "login.php";
	public static String FORGOT_PASSWORD = "forgot_password.php";
	public static String CREATE_GROUP = "create_group.php";
	public static String SAVE_SESSION = "save_session.php";
	public static String GET_MY_GROUP = "get_my_group.php";
	public static String GET_ALL_SESSION = "get_all_session.php";
	public static String SEND_FEEDBACK = "send_feedback.php";

	public static String PREF_NAME = "gendertimerpref";
	public static String TAG = "Utils";
	public static String USER_EMAIL = "email";
	public static String USER_PASSWORD = "password";
	public static String USER_ID = "user_id";
	public static String GENDER_TYPE = "gender_type";
	public static String Two_Three = "two_three";
	

	// twitter
	public static final String PREF_KEY_OAUTH_TOKEN = "oauth_token";
	public static final String PREF_KEY_OAUTH_SECRET = "oauth_token_secret";
	public static final String PREF_KEY_TWITTER_LOGIN = "is_twitter_loggedin";
	public static final String TWITTER_USER_NAME = "twitter_user_name";
	public static final String TWITTER_ID = "twitter_id";

	// USER
	public static final String PARSE_FACEBOOK_ID = "authData";
	public static final String PARSE_USER_ID = "user_id";
	public static final String PARSE_OBJECT_ID = "objectId";

	// GROUP
	public static final String PARSE_GROUP_NAME = "name";
	public static final String PARSE_NO_SESSIONS = "sessionCount";
	public static final String PARSE_GROUP_RATIO = "points";
	public static final String PARSE_GROUP_SCORE = "group_score";
	public static final String PARSE_LAST_SESSION = "lastSession";

	// SESSION
	public static final String PARSE_SESSION_NAME = "name";
	public static final String PARSE_NOTES = "notes";

	public static final String PARSE_NO_OF_MALE_SPEAKER = "menCount";
	public static final String PARSE_MALE_SPEAKER_TIMER = "menTime";
	public static final String PARSE_MALE_SLOTS = "menSpeakCount";

	public static final String PARSE_NO_OF_FEMALE_SPEAKER = "womenCount";
	public static final String PARSE_FEMALE_SPEAKER_TIMER = "womenTime";
	public static final String PARSE_FEMALE_SLOTS = "womenSpeakCount";

	public static final String PARSE_NO_OF_THIRD_GENDER_SPEAKER = "thirdGenderCount";
	public static final String PARSE_THIRD_GENDER_SPEAKER_TIMER = "thirdGenderTime";
	public static final String PARSE_THIRD_GENDER_SLOTS = "thirdGenderSpeakCount";

//	public static final String PARSE_SCORE = "score";
	public static final String PARSE_PRIVACY = "public";
	public static final String PARSE_RATIO = "points";
	public static final String PARSE_GROUP_ID = "group";
	public static final String PARSE_GEO_POINT = "coord";
//	public static final String PARSE_LATITUDE = "latitude";
//	public static final String PARSE_LONGITUDE = "longitude";
	//public static final String TWO_THREE = "two_three";

	// FEEDBACK
	public static final String PARSE_FEEDBACK_EMAIL = "email";
	public static final String PARSE_FEEDBACK_MESSAGE = "message";
	public static final String PARSE_FEEDBACK_USER_ID = "user";

	public static boolean validateString(String object) {
		boolean flag = false;
		if (object != null && !object.isEmpty()
				&& object.equalsIgnoreCase("null") != true
				&& object.trim().length() > 0
				&& !object.equalsIgnoreCase("(null)")) {
			flag = true;
		}
		return flag;
	}




	public static boolean checkInternetConnection(Context context) {

		ConnectivityManager cm = (ConnectivityManager) context
				.getSystemService(Context.CONNECTIVITY_SERVICE);
		if (cm.getActiveNetworkInfo() != null
				&& cm.getActiveNetworkInfo().isAvailable()
				&& cm.getActiveNetworkInfo().isConnected()) {
			return true;
		} else {
			// Toast.makeText(context, "Conex�o com a internet indispon�vel.",
			// Toast.LENGTH_SHORT).show();
			return false;
		}
	}

	public static final void showMessageDialog(Context context, String title,
			String message) {
		if (message != null && message.trim().length() > 0) {
			AlertDialog.Builder builder = new AlertDialog.Builder(context);
			builder.setTitle(title);
			builder.setCancelable(false);
			builder.setMessage(message);
			builder.setPositiveButton("OK",
					new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int id) {
							dialog.dismiss();
						}
					});
			// create alert dialog
			AlertDialog alertDialog = builder.create();
			// show it
			alertDialog.show();
		}
	}

	public static boolean isEmailValid(String email) {
		String expression = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		CharSequence inputStr = email;
		boolean flag = false;
		Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(inputStr);
		if (matcher.matches()) {
			flag = true;
		}
		return flag;
	}
}
