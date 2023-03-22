package Task.AdapterPhone;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        Headphones headphones = new Headphones();
        //headphones -> HeadphonesLighthingAdapter
        HeadPhoneLighingAdapter adapter = new HeadPhoneLighingAdapter(headphones);
        phone.get(adapter);
    }

    // Phone < LightingInput

    static class Phone {
        public void get(LightingInput lightingInput) {

        }

    }
    static class HeadPhoneLighingAdapter  implements LightingInput{    // Адаптер
        private Headphones headphones;
        public HeadPhoneLighingAdapter(Headphones headphones){
            this.headphones = headphones;
        }
        
        @Override
        public void lightingSignal(){ 
            // тутнаходится логика преобразования обьекта headphones в lighting   (Signal)

        }

    }

    static class Headphones {
        public HeadPhoneInput input() {
            return null;
        }

    }

    static interface LightingInput {  //адептер преобразует этот интерфэс
        void lightingSignal();

    }

    static interface HeadPhoneInput {

    }
}
