package exam;

/**
 * @author Silvana
 */
public class TestPetHotel {
    
    public static void main(String [] args){
        Pet myDog = new Dog("dog necklace","blue");
        Pet myCat = new Cat("cat necklace","green");
        myDog.setName("Gober");
        myDog.setOwner("Silvana");
        myCat.setName("Olaf");
        myCat.setOwner("Brenda");
        
        PetHotel petHotel = new PetHotel();
        petHotel.addPet(myDog);
        petHotel.addPet(myCat);
        
        if(petHotel.getPets().size()>0)
            System.out.println("The hotel has: "+ petHotel.getPets().get(0).getNumPets()+ " pets");
        
        Pet myRabbit = new Rabbit("rabbit necklace","red");
        myRabbit.setName("Bugs");
        myRabbit.setOwner("Gerardo");
        
        System.out.println("There is a new pet guest in the hotel");
        
        petHotel.addPet(myRabbit);
        System.out.println("The hotel has: "+ petHotel.getPets().get(0).getNumPets()+ " pets\n\n");
        
        petHotel.feedPets();
        for(Pet pet: petHotel.getPets()){
            System.out.println(pet.getData());
            System.out.println("-------------");
        }
		
		Dog myDog2 = (Dog) myDog;//downcasting
		Cat myCat2 = (Cat) myCat;//downcasting
		Rabbit myRabbit2 = (Rabbit) myRabbit;//downcasting
		
		myDog2.eat("dog food");//using the child method
		myCat2.eat("cat food");//using the child method
		myRabbit2.eat("rabbit food");//using the child method
		
    }
}
