package com.example.societyschool;

public class QuestionBio {

    public String mQuestion[] = {
            "Inima sau cordul este organul reprezentativ al aparatului:",

            "Inima este alcătuită din patru cavități și anume:",

            "Inima este un organ musculos şi cavitar, de mărimea pumnului drept, care cântăreşte aproximativ ",

            "La baza aortei, cât şi la baza arterei pulmonare se află:",

            "Capilarele, vase cu diametrul mai mic de :",

            "Circulaţia sângelui este mai lentă decât în artere, ceea ce permite schimbul de: ",

            "Dupa un accident, cum procedam daca o victima este in stop cardio-respirator",

            "Majoritatea venelor situate sub inimă prezintă pe pereţii lor valvule în formă de:",

            "Cele mai importante vene sunt vena cavă inferioară şi vena cavă superioară, care se deschid în"

    };

    private String mChoices[][] =
            {

                    {"Digestiv","Respirator","Excretor","Cardiovascular"},

                    {"2 atrii si 3 ventriculi","un atriu si 2 ventriculi","2 atrii si un ventriculi","2 atrii si 2 ventriculi"},

                    {"1g","300g","1000g","50g"},

                    {"3 valvule","4 valvule","o valvula","2 valvule"},

                    {"2mm","3cm","6-30 µm","1mm"},

                    {"Substante","Celule","Sange","Gaze"},

                    {"Oferim primul ajutor","Nimic","Cautam ajutor","Asteptam ajutor"},

                    {"cerc","cuib","pachet","U"},

                    {"vena cava","aorta","atriul drept","atriul stang"}
            };

    private String mCorrectAns[] = {"Cardiovascular","2 atrii si 2 ventriculi","300g","3 valvule","6-30 µm","Substante","Prim ajutor","cuib","atriul drept" };

    public String getQuestion(int a){

        String question = mQuestion[a];
        return question;
    }

    public String getChoices0(int a){
        String choice = mChoices[a][0];
        return choice;
    }

    public String getChoices1(int a){
        String choice = mChoices[a][1];
        return choice;
    }
    public String getChoices2(int a){
        String choice = mChoices[a][2];
        return choice;
    }
    public String getChoices3(int a){
        String choice = mChoices[a][3];
        return choice;
    }

    public String getCorrectAns(int a){
        String answer = mCorrectAns[a];
        return answer;
    }

}
