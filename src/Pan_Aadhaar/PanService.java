package Pan_Aadhaar;

import java.util.HashMap;
import java.util.Map;

public class PanService {
    private static Map<String, Pan> panMap= new HashMap<>();
    static {
        panMap.put("PRAT1234P",new Pan("PRAT1234P","987654321012",
                "SBI BANK","FD"));

        panMap.put("RANI1234R",new Pan("RANI1234R","987654321013",
                "SBI BANK","FD"));

        panMap.put("DEBE1234D",new Pan("DEBE1234D","987654321014",
                "SBI BANK","FD"));
    }
    public Pan getPanByAadhaarNumber(String aadhaarNumber){
        for(Pan pan: panMap.values())
        {
            if(pan.getAadhaarNumber().equals(aadhaarNumber))
            {
                return pan;
            }

        }
        return null;
    }
}
