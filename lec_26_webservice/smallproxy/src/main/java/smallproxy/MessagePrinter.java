package smallproxy;


import java.util.ArrayList;
import java.util.List;

import io.netty.buffer.ByteBuf;
import io.netty.util.internal.StringUtil;

/**
 * Created by ekokuykin on 06.06.15.
 */
public class MessagePrinter {

    private static final char[] BYTE2CHAR = new char[256];
    private static final String[] BYTE2HEX = new String[256];

    static {
        int i;
        // Generate the lookup table for byte-to-char conversion
        for (i = 0; i < BYTE2CHAR.length; i++) {
            if (i <= 0x1f || i >= 0x7f) {
                BYTE2CHAR[i] = '.';
            } else {
                BYTE2CHAR[i] = (char) i;
            }
        }

        for (i = 0; i < BYTE2HEX.length; i++) {
            BYTE2HEX[i] = ' ' + StringUtil.byteToHexStringPadded(i);
        }

    }

    public static String getRequestText(ByteBuf buf){
        StringBuilder select = new StringBuilder();
        for (int j = 0; j < buf.capacity(); j ++) {
            if (BYTE2CHAR[buf.getUnsignedByte(j)] != '.' ||
                    BYTE2HEX[buf.getUnsignedByte(j)].equalsIgnoreCase(" 2e") ||
                    BYTE2HEX[buf.getUnsignedByte(j)].equalsIgnoreCase(" 0a") ||
                    BYTE2HEX[buf.getUnsignedByte(j)].equalsIgnoreCase(" 09")) {
                select.append(BYTE2HEX[buf.getUnsignedByte(j)].equalsIgnoreCase(" 0a") ||
                        BYTE2HEX[buf.getUnsignedByte(j)].equalsIgnoreCase(" 09")? " " : BYTE2CHAR[buf.getUnsignedByte(j)]);
            }
        }
        return select.toString().toLowerCase();
    }

}
