package leak;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ekokuykin on 02.07.15.
 * copied from https://plumbr.eu/outofmemoryerror/java-heap-space
 */
public class KeylessEntry {

    static class Key {
        Integer id;

        Key(Integer id) {
            this.id = id;
        }

        @Override
        public int hashCode() {
            return id.hashCode();
        }

       /* @Override
        public boolean equals(Object o) {
            boolean response = false;
            if (o instanceof Key) {
                response = (((Key)o).id).equals(this.id);
            }
            return response;
        }*/
    }

    //запустить с ключом -Xmx12m -XX:-UseGCOverheadLimit для получения ошибки
    //-Xmx12m -XX:-UseGCOverheadLimit -XX:+HeapDumpOnOutOfMemoryError -XX:+HeapDumpBeforeFullGC для снятия дампа

    //-XX:+UnlockCommercialFeatures -XX:+FlightRecorder -XX:StartFlightRecording=duration=60s,filename=myrecording.jfr
    public static void main(String[] args) {
        Map<Key, String > m = new HashMap<Key, String >();
        while (true)
            for (int i = 0; i < 10000; i++)
                if (!m.containsKey(new Key(i)))
                    m.put(new Key(i), "Number:" + i);
    }
}
