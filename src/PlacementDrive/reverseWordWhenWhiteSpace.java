package PlacementDrive;

public class reverseWordWhenWhiteSpace {
    
    public static void main(String[] args) {
        String str = "Hello world";
        System.out.println(Reverse(str));
    }
    
    public static String Reverse(String str) {
        // Correctly splitting words by space
//    	["hello","world"]
//    	["h","e"]
        String[] words = str.split(" ");
        StringBuilder res = new StringBuilder();
        
        // Reversing each word
        for (String word : words) {
        	
        	//["hello","World"]-->words arr
        	
//        	"olleh "
            res.append(new StringBuilder(word).reverse()).append(" "); // Maintain spaces
        }
        
        return res.toString().trim(); // Trim extra space at the end
    }
}
