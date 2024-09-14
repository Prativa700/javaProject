package Pan_Aadhaar;

import java.util.HashMap;
import java.util.Map;

public class AadhaarService {

    private static Map<String, Aadhaar> aadhaarMap =new HashMap<>();

    static {
        aadhaarMap.put("987654321012",new Aadhaar("987654321012","Prativa Mondal",
                "Ganesh Mondal","Rampurhat,Birbhum"));
        aadhaarMap.put("987654321013",new Aadhaar("987654321013","Rani Mondal",
                "Ganesh Mondal","Rampurhat, Birbhum"));
        aadhaarMap.put("987654321014",new Aadhaar("987654321014","Debesh Mondal",
                "Ganesh Mondal","Rampurhat, Birbhum"));
    }
    public Aadhaar getAadhaarByNumber(String aadhaarNumber){
        return aadhaarMap.get(aadhaarNumber);

    }
}
