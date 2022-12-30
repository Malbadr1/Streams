import java.awt.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

import static javax.print.attribute.standard.MediaSizeName.D;

public class StreamEx {

    void streams (){
        Integer []arr={4,2,3,1,5,6};
        Stream<Integer>list=Arrays.stream(arr);
        long count= list.filter(i ->(i%2==0) ).count();
        System.out.println(count);
        Arrays.sort(arr);
        for (int i:arr
        ) {
            System.out.println(i);
        }
    }

    void MapStream() throws IOException {
      Stream <String> lines= Files.lines(Path.of("D://xxx.txt "), StandardCharsets.UTF_8);
    }
    public static void main(String[] args) {

    StreamEx streamEx=new StreamEx();
  //  streamEx.streams();






    }
}
