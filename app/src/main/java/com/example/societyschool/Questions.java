package com.example.societyschool;

public class Questions {

    public String mQuestion[] = {
            "Unde este utlizata informatica in societatea in care traim?",

            "Unde este utlizata matematica in societatea in care traim?",

            "Chimia este stiinta care ne-a ajutat sa descoperim: ",

            "Practicarea sportului duce la imbunatatirea",

            "In Romania, Constitutia a fost fondata in anul?",

            "Neglijarea mediului inconjurator duce la deteriorarea : ",

            "Dupa un accident, cum procedam daca o victima este in stop cardio-respirator",

            "Fizica a dus la aparitia :",

            "Pentru angajare, un angajator ne va solicita prima oara :"

    };

    private String mChoices[][] =
        {

        {"Gastronomie","Psihologie","Tamplarie","Biologie"},

        {"Gastronomie","Psihologie","Sociologie","Astronomie"},

        {"Matematica","Combustibil Nuclear","Informatica","Electricitatea"},

        {"Sanatatii","Economiei","Inteligentei","Agriculturii"},

        {"1687","1901","1991","1191"},

        {"Climei","Invatamantului","Descoperirilor stiintifice","Gandirii"},

        {"Oferim primul ajutor","Nimic","Cautam ajutor","Asteptam ajutor"},

        {"Biologiei","Motorului electric","Combustibilului Nuclear","Teoremei lui Pitagora"},

        {"Cazier","Analizele","CV","Permisul de conducere"}
    };

    private String mCorrectAns[] = {"Biologie","Astronomie","Combustibil Nuclear","Sanatatii","1991","Climei","Prim ajutor","Motorului electric","CV" };

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
