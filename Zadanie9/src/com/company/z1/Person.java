package com.company.z1;

public class Person {
    String f_name, l_name;
    int birth_year;

    private void checkPersonData(String f_name, String l_name, int birth_year){
        if (f_name.isEmpty() == true){
            throw new IllegalArgumentException("Pole imie nie moze byc puste!");
        }
        else if (l_name.isEmpty() == true){
            throw new IllegalArgumentException("Pole nazwisko nie moze byc puste!");
        }
        else if ((birth_year < 1900) || (birth_year > 2021)){
            throw new IllegalArgumentException("Podano niewłaściwy rok urodzenia!");
        }

    }

    public Person(String f_name, String l_name, int birth_year) {

        checkPersonData(f_name, l_name, birth_year);

        this.f_name = f_name;
        this.l_name = l_name;
        this.birth_year = birth_year;
    }

    @Override
    public String toString(){
        return String.format("Imię: %s\nNazwisko: %s\nRok urodzenia: %d",f_name,l_name,birth_year);
    }
}
