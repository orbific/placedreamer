package com.riddlefox.placedreamer;

public class Placedreamer {

	String[] placeDescriptions = {
			"Agra is a city in Northern India, famed as the home of the Taj Mahal. It is home to two other heritage sites, Agra Fort and the city of Fatepur Sikri."
			, "Amritsar is the location of the Golden Temple, the holiest gurdwara of the Sikh religion."
			, "Near to Amritsar is Wagah, site of the only border crossing between India and Pakistan. It is famous for the flag-lowering ceremony, featuring exaggerated marches from specially-trained soldiers."
			, "Between fifty to a hundred thousand people dine free every day at the Golden temple in Amritsar. Everyone, from commoner to head of state, is expected to sit on the floor as equals."
			, "Avebury is a henge monument containing three stone circles in the midst of an English village. It was used as the location for the seventies TV show, Children of the Stones."
			, "Avebury's Red Lion pub is famous as the only pub in the world that is contained within a stone circle. It is a centre for celebrations following the Stone henge solstice."
			, "The Avebury monument is a part of a larger prehistoric landscape containing several older monuments. These include West Kennet Long Barrow and Silbury Hill, a massive human-made structure."
			, "Over half of the States in America have at least one Brighton. The only Brighton outside Sussex with a neighbouring Hove is in Adelaide, Australia."
			, "Brighton is a city on the south coast of England, famed for its laid-back atmosphere. It is said to be the crossing point for several ley lines."
			, "Saint Bartholomew’s Church, in Brighton's North Laine, is the tallest brick church in Europe. It is said to be built to the same dimensions as Noah’s Ark."
			, "Brighton is famous for the Royal Pavilion, its Indian-inspired palace. During the Second World War, the Germans were not supposed to bomb Brighton because Hitler wanted the Royal Pavilion as his seaside home."
			, "Darjeeling is a small town in the Himalayan foothills. Its name originates from two Tibetan words: “Dorje” and “ling”, and translates to English as the ‘place where there is thunderbolt’."
			, "Darjeeling can be reached by road or, more slowly, with the so-called toy train, considered by UNESCO as \"the most outstanding example of a hill passenger railway\" in the world."
			, "Darjeeling is world famous for its tea farms, which include the Happy Valley tea estate, founded in 1854. Many of the old estate houses are rumoured to be haunted."
			, "People talk of the seven cities of Delhi, referring to the different dynasties that have founded capital cities around new fortresses. It is said that founding a new capital causes an empire to end. Britain inaugurated New Delhi in 1931 and in 1947 India declared independence."
			, "Delhi is the capital of India. It's the entry-point for many foreign travellers, who spend their first night in the tourist district of Paharganj."
			, "Central Delhi contains the Jantar Mantar, a collection of stone astronomical instruments built in 1724 by Maharajah Sawai Jai Singh. Similar observatories were built in Varanasi and Jaipur"
			, "Swayambunath temple is to the west of Kathmandu, and sometimes known as the monkey temple. If you can climb to the top without stopping for breath, then it is said that you will achieve enlightenment in this lifetime."
			, "The most famous street in Kathmandu is called Freak Street. It is where the sixties and seventies hippies lived. This was the one of the ends of the overland bus route from Europe that used to pass through Iran Pakistan and Afghanistan."
			// Pushkar is said to be founded by the God Brahma dropping a lotus flower in Pushkar Lake.  Some people say that Pushkar is the only city where Brahman can be worshipped.
			// Pushkar is home to the world's biggest camel fair, which happens in the month of November. It includes camel races and moustache competitions
			, "San Francisco was the home of Joshua Abraham Norton, who declared himself the Emperor of the United States in 1859. He was widely respected and over 30,000 people turned out for his funeral."
			, "San Francisco is known for its cool summers, fog, steep rolling hills and eclectic culture. It's weather is temperamental, and Mark Twain claimed that the worst winter of his life was a summer in San Francisco."
			, "The Beat Generation started in New York, but its spiritual home is San Francisco. The City Lights bookstore, on Columbus Avenue, keeps the movement's memory alive. In 1957 it was the centre of an obscenity trial for publishing Allen Ginsberg's poem Howl."
			, "Haight-Ashbury in San-Francisco is famous as the origin of the hippie counter-culture. The 'Summer of Love' actually began in Janury of 1967, with the Human Be-In at Golden Gate Park."
			, "Varanasi, on the banks of the Ganges, is one of the holiest cities in the world. It is also known as Benares and Kashi, which means 'city of light'. The ghats down to the river are the center of the city's religious life."
			, "Mark Twain famously described Varanasi as “older than history, older than tradition, older even than legend, and looks twice as old as all of them put together”. The city has been razed to the ground several times, and many buildings are relatively modern."
			, "Varanasi is described as a tirtha, or crossing-place, where the sacred and divine can meet. Some say gods and goddesses come to bathe there. Many dying people stay in the city in the hope of achieving moksha, salvation of the soul from the cycle of birth, death and rebirth."
			, "Among the temples of Varanasi is the Mother India Temple. Rather than images of Gods and Goddesses, this contains a huge map of India, carved in marble."
			, "Varanasi is said to be so holy that people who die there do not need to be reincarnated. One saying says it is better to have your legs broken than to risk leaving Varanasi and dying elsewhere."
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
