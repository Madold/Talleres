package main;

public class Array {

    private String[] namesList;
    private int length;
    private int avaliableSpaces;

    public Array(int length) {
        this.length = length;
        namesList = new String[length];
        avaliableSpaces = this.length;
    }
    
    public int getAvaliableSpaces() {
        return avaliableSpaces;
    }

    public void decreaseSpaces() {
        avaliableSpaces--;
    }
    
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setElement(int index, String value) {
        namesList[index] = value;
    }

    public String getElement(int index) {
        return namesList[index];
    }

    //Para hacer la búsqueda de un elemento en el arreglo
    public int findElementIndexByName(String element) {
        int index = 0;
        boolean found = false;

        while (index < length) {
            if (namesList[index].equals(element)) {
                found = true;
                break;
            }
            index++;
        }

        return found == false ? -1 : index;
    }

}
