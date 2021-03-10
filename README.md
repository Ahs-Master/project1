import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Card {
        private String faceName;
        private String suit;


        public Card(String faceName, String suit) {
            setFaceName(faceName);
            setSuit(suit);


        }
        public void setFaceName(String faceName){
            List<String> validFaceNames = getValidFaceNames();
            faceName = faceName.toLowerCase();

            if(validFaceNames.contains(faceName)){
            this.faceName = faceName;
            }
        }

        public void setSuit(String suit){
            this.suit = suit;
        }

        public String getFaceName() {
             return faceName;
        }
        public String getSuit() {
            return suit;
        }

        public static List<String> getValidFaceNames(){
            return Arrays.asList("Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King");
        }

        public String toString(){
            return String.format("%s of $s",faceName,suit);
        }
}
