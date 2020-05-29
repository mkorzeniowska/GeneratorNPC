/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Grzegorz
 */
public class Person {
    
    private int id, strength, dexterity, constitution, intelligence, wisdom, charisma;
    private String name, surname, race, subrace, job, skill, character, apperance, sex, personality, age;
    
    public String getIntAttributes() {
    	String intAttributes =  String.format(
    			"ID: %d\n"
			+ "Siła: %d\n"
			+ "Zręczność: %d\n"
			+ "Kondycja: %d\n"
			+ "Inteligencja: %d\n"
			+ "Wiedza: %d\n"
			+ "Charyzma: %d",
			id, strength, dexterity, constitution, intelligence, wisdom, charisma);
    	
    		return intAttributes;
    	}
    public String getStringAttributes() { 
    	String stringAttributes =  String.format(
		   		"Imie:%s\n"
			+ "Nazwisko: %s\n"
			+ "Rasa: %s\n"
			+ "Podrasa: %s\n"
			+ "Klasa: %s\n"
			+ "Umiejetność: %s\n"
			+ "Charakter: %s\n"
			+ "Wygląd: %s\n"
			+ "Płeć: %s\n"
			+ "Osobowść: %s\n"
			+ "Wiek: %s",
			name, surname, race, subrace, job, skill, character, apperance, sex, personality, age );
    	
    		return stringAttributes;
    	}
    
    public void printAll() {
    	System.out.println(getIntAttributes());
    	System.out.println(getStringAttributes());
    	
    }
    public Person(){}
    public Person(int id, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma,
            String name, String surname, String race, String subrace, String job,
            String skill, String character, String apperance, String sex, String personality, String age) {
    	
        this.id = id;
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
        this.name = name;
        this.surname = surname;
        this.race = race;
        this.subrace = subrace;
        this.job = job;
        this.skill = skill;
        this.character = character;
        this.apperance = apperance;
        this.sex = sex;
        this.personality = personality;
    }

    public int getId() {
        return id;
    }

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getRace() {
        return race;
    }

    public String getSubrace() {
        return subrace;
    }

    public String getJob() {
        return job;
    }

    public String getSkill() {
        return skill;
    }

    public String getCharacter() {
        return character;
    }

    public String getApperance() {
        return apperance;
    }

    public String getSex() {
        return sex;
    }

    public String getPersonality() {
        return personality;
    }
    
    public String getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setSubrace(String subrace) {
        this.subrace = subrace;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public void setApperance(String apperance) {
        this.apperance = apperance;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setPersonality(String personality) {
        this.personality = personality;
    }

    public void setAge(String age) {
        this.age = age;
    }

    
}
