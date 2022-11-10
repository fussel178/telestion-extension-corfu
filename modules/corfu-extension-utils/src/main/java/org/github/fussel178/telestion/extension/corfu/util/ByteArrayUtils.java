package org.github.fussel178.telestion.extension.corfu.util;

import java.util.Objects;

public class ByteArrayUtils {

	/**
	 * <h4>Description</h4>
	 * Calculates the amount of bytes that are needed to represent the number of bits in a "bit-by-bit" format.
	 *
	 * <h4>Example</h4>
	 *
	 * <pre>
	 *                              &lt;--- 1 byte ---&gt; &lt;--- 1 byte ---&gt;
	 *     Needed by application:   1 1 1 0 0 1 0 1 : 1 1              (10 bits)
	 *     Storage representation:  1 1 1 0 0 1 0 1 : 1 1 0 0 0 0 0 0  (16 bits or 2 bytes)
	 * </pre>
	 *
	 * @param bits the number of bits
	 * @return the required amount of bytes to represent the number of bits
	 */
	public static int bytesPerBits(int bits) {
		return bits > 0 ? (bits - 1) / 8 + 1 : 0;
	}

	/**
	 * <h4>Description</h4>
	 * Stringifies the given binary array in a colon of words in hexadecimal representation.
	 *
	 * <h4>Example</h4>
	 *
	 * <pre>[0E 13 29 A4 BC BF FF 07 35 69] (size: 9 bytes)</pre>
	 *
	 * @param data the binary array that should be stringified
	 * @return the stringified version of the binary data
	 */
	public static String toString(byte[] data) {
		if (Objects.isNull(data)) return "null";

		int iMax = data.length - 1;
		if (iMax < 0) {
			return "[]";
		}

		var sb = new StringBuilder().append("[");
		for (int i = 0; ; i++) {
			sb.append(String.format("%02X", data[i]));
			if (i >= iMax) {
				return sb.append("] (size: ").append(data.length).append(" bytes)").toString();
			}

			sb.append(" ");
		}
	}
}
