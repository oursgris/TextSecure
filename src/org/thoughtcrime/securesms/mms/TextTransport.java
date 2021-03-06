/** 
 * Copyright (C) 2011 Whisper Systems
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.thoughtcrime.securesms.mms;

import java.io.IOException;

import org.whispersystems.textsecure.crypto.TransportDetails;
import org.whispersystems.textsecure.util.Base64;

public class TextTransport implements TransportDetails {

  @Override
  public byte[] getDecodedMessage(byte[] encodedMessageBytes) throws IOException {
    return Base64.decode(encodedMessageBytes);
  }

  @Override
  public byte[] getEncodedMessage(byte[] messageWithMac) {
    return Base64.encodeBytes(messageWithMac).getBytes();
  }

  @Override
  public byte[] getPaddedMessageBody(byte[] messageBody) {
    return messageBody;
  }

  @Override
  public byte[] getStrippedPaddingMessageBody(byte[] messageWithPadding) {
    return messageWithPadding;
  }

}
