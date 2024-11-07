public class PalyndromPruefer {

        public static boolean palyndrompruefung(String word){

            word = word.toLowerCase();
            int counter = 0;

            for(int i = 0; i < word.length(); i++){

                if(word.charAt(i) == word.charAt(word.length()-1-i)){
                    counter += 1;
                }

            }
            if (counter == word.length()){
                return true;
            }
            else{
                return false;
            }

        }


        public static void main(String[] args) {

            System.out.println(palyndrompruefung("Lagerregal"));


        }
    }

