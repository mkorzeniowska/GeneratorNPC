/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mssql_test;


public class Person {
    

    private int id, strength=0, dexterity=0, constitution=0, intelligence=0, wisdom=0, charisma=0;
    private String name, surname, race, subrace, job, skill, character, apperance, sex, personality;

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

    public Person(){
        
    }
    public Person(int id, String name){
        this.name = name;
        this.id = id;
    }
}

   
    

