package com.nutricao.helpers;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Helper {

	private static MessageDigest md;

	public static String generateMD5(String md5) {
		try {
			if (md == null) {
				md = MessageDigest.getInstance("MD5");
			}

			byte[] array = md.digest(md5.getBytes());
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < array.length; ++i) {
				sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100)
						.substring(1, 3));
			}
			return sb.toString();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}

		return null;
	}
}
