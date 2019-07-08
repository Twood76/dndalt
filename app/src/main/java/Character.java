import java.util.ArrayList;

public class Character {
    // Data files
    private String imageFilePath;
    private String initFilePath;

    // Character info
    private String characterName;
    private String characterRace;
    private String characterRank;

    // Edge and Hindrance features to be more appropriately implemented in the future
    // For now, a count of each will suffice for implementing their roles in character creation
    private int majorHindrances;
    private int minorHindrances;
    private int edges;

    // Statistics
    private int charisma;
    private int pace;
    private int parry;
    private int toughness;

    // Attributes and Skills
    private ArrayList<Attribute> attributes;
    private ArrayList<Skill> skills;

    // Getters
    public String getImageFilePath() { return imageFilePath; }
    public String getInitFilePath() { return initFilePath; }
    public String getCharacterName() { return characterName; }
    public String getCharacterRace() { return characterRace; }
    public String getCharacterRank() { return characterRank; }
    public int getMajorHindrances() { return majorHindrances; }
    public int getMinorHindrances() { return minorHindrances; }
    public int getEdges() { return edges; }
    public int getCharisma() { return charisma; }
    public int getPace() { return pace; }
    public int getParry() { return parry; }
    public int getToughness() { return toughness; }
    public ArrayList<Attribute> getAttributes() { return attributes; }
    public ArrayList<Skill> getSkills() { return skills; }

    // Modifiers
    public void setImageFilePath(String str) { imageFilePath = str; }
    public void setInitFilePath(String str) { initFilePath = str; }
    public void setCharacterName(String str) { characterName = str; }
    public void setCharacterRace(String str) { characterRace = str; }
    public void setCharacterRank(String str) { characterRank = str; }
    public void setMajorHindrances(int i) { majorHindrances = i; }
    public void setMinorHindrances(int i) { minorHindrances = i; }
    public void setEdges(int i) { edges = i; }
    public void setCharisma(int i) { charisma = i; }
    public void setPace(int i) { pace = i; }
    public void setParry(int i) { parry = i; }
    public void setToughness(int i) { toughness = i; }
    public void addAttribute(Attribute a) { attributes.add(a); }
    public void addSkill(Skill s) { skills.add(s); }

    // Constructors
    public Character() { }

    // Functions
    public void saveCharacter() { } // Save character to init file
    public void loadFromFile(String fileName) { } // Use when selecting character to load data from file
}