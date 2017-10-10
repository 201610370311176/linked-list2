package DoubleLinkedList;

public class DoubleLinkedList {
    
    Neighbor firstLink;
    Neighbor lastLink;        
            
    public boolean isEmpty(){
        return (firstLink == null);
    }
    
    
    
    public void insertAtFirstPosition(String homeOwnerName, int houseNumber){
        
        Neighbor newLink = new Neighbor(homeOwnerName, houseNumber);
        
        if(isEmpty()){
            lastLink = newLink;         // KALO BELOM ADA ISI , ISI LINK YANG DIMASUKKIN JADI LASTLINK
        }
        
        else { 
            firstLink.previous = newLink;
        }
        
        newLink.next = firstLink;       //ALAMAT NEXT ---> FIRSTLINK
        firstLink = newLink;            // ISI FIRSTLINK = NEWLINK 
        
        
        
    }
    
    public void insertAtLastPosistion(String homeOwnerName, int houseNumber){
        
        Neighbor newLink = new Neighbor(homeOwnerName, houseNumber);
        
         if(isEmpty()){
            firstLink = newLink;        // KALO BELOM ADA ISI , ISI LINK YANG DIMASUKKIN JADI FIRSTLINK
        } 
         else {
            lastLink.next = newLink; 
            newLink.previous = lastLink;
         }
        
        lastLink = newLink;
    }
    
    public void display(){
        
        Neighbor theLink = firstLink;
        while(theLink != null){
            theLink.display();
            System.out.println("Rumah Selanjutnya : "+ theLink.next);
            theLink = theLink.next;             // theLink sekarang bakalan nunjuk ke link yang selanjutnya
        }
        
    }
    
    
    public static void main(String[] args) {
        
        DoubleLinkedList linkedList = new DoubleLinkedList();
        linkedList.insertAtFirstPosition("Yudi", 2);
        linkedList.insertAtFirstPosition("Dimas", 3);
        linkedList.insertAtLastPosistion("Rumah Terakhir", 42);
        linkedList.display();
        System.out.println("sebelum rumah terakhir : "+linkedList.lastLink.previous);
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
            
  class Neighbor {
    
    public String homeOwnerName;
    public int houseNumber;
    
    public Neighbor next;
    public Neighbor previous;
    
    public Neighbor(String homeOwnerName , int houseNumber){
        this.homeOwnerName = homeOwnerName;
        this.houseNumber = houseNumber;
    }
    
    public void display(){
        System.out.println("Pemilik Rumah : " + homeOwnerName+ " Nomor : "+ houseNumber);
    }
    
    public String toString(){
        return homeOwnerName;
    }
    
  }
}
