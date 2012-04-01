package com.pentip.mobileback;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransport;

import android.app.Activity;
import android.widget.TextView;

public class Login extends Activity {
	String SERVICE_URL;
	String SERVICE_NAMESPACE;
	String SOAP_ACTION;
	String SERVICE_ENVELOPE;
	String METHOD_NAME;
	SoapObject envelope = new SoapObject(SERVICE_NAMESPACE, METHOD_NAME);

	public boolean connect(String emailAddress, String password) {
		boolean login;
		TextView usr = (TextView) findViewById(R.id.editText1);
		TextView pwd = (TextView) findViewById(R.id.editText2);

	
		try {

			SoapObject request = new SoapObject(SERVICE_NAMESPACE, METHOD_NAME);
			SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(
					SoapEnvelope.VER11);
			envelope.setOutputSoapObject(request);
			HttpTransport loginHttpTransport = new HttpTransport(SERVICE_URL);
			loginHttpTransport.call(SOAP_ACTION, envelope);
			SoapPrimitive result = (SoapPrimitive) envelope.getResponse();
			PropertyInfo username;
			PropertyInfo passwd;

			request.addProperty(username, passwd);
			// code to hash the passwords
			// try {
			// MessageDigest digest = MessageDigest.getInstance("SHA-256");
			// byte[] hash = digest.digest(String.getBytes("UTF-8"));
			//
			// StringBuffer buffer = new StringBuffer();
			// for (int x = 0; x < hash.length; x++) {
			// buffer.append(Integer
			// .toString((hash[x] & 0xff) + 0x100, 16)
			// .substring(1));
			// }
			//
			// return buffer.toString();
			// } catch (NoSuchAlgorithmException e) {
			// e.printStackTrace();
			// } catch (UnsupportedEncodingException e) {
			// e.printStackTrace();
			// }

		} catch (Exception e) {

		}
		return true;
	}
}
