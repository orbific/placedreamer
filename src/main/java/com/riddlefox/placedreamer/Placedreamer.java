package com.riddlefox.placedreamer;

public class Placedreamer {

	String[] placeDescriptions = {
			"Agra is a city in Northern India, famed as the home of the Taj Mahal."
			, "Amritsar is the location of the Golden Temple, the holiest gurdwara of the Sikh religion."
			, "Avebury is a henge monument containing three stone circles in the midst of an English village."
			, "Brighton is a city on the south coast of England, famed for its laid-back atmosphere."
			, "Darjeeling is a small town in the Himalayan foothills."
			, "Delhi is the capital of India."
			, "Jaipur is the capital of Rajasthan, famed as the 'pink city'."
			, "Kathmandu is the capital of Nepal."
			, "Panaji, captial city of Goa, India, lies on the banks of the Mandovi River estuary."
			, "Pushkar is one of the five sacred Hindu pilgrimage sites."
			, "San Francisco is known for its cool summers, fog, steep rolling hills and eclectic culture."
			, "Varanasi, on the banks of the Ganges, is one of the holiest city in the world."
	};
	
	public static void main(String[] args) {
		Placedreamer instance = new Placedreamer();
		System.out.println(instance.getPlaceDescription());
	}

	public Placedreamer() {}

	public String getPlaceDescription() {
		return placeDescriptions[(int)(Math.random() * placeDescriptions.length)];
	}	
}
