package com.riddlefox.placedreamer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.amazon.speech.json.SpeechletRequestEnvelope;
import com.amazon.speech.slu.Intent;
import com.amazon.speech.speechlet.IntentRequest;
import com.amazon.speech.speechlet.LaunchRequest;
import com.amazon.speech.speechlet.SessionEndedRequest;
import com.amazon.speech.speechlet.SessionStartedRequest;
import com.amazon.speech.speechlet.SpeechletResponse;
import com.amazon.speech.speechlet.SpeechletV2;
import com.amazon.speech.ui.PlainTextOutputSpeech;
import com.amazon.speech.ui.SimpleCard;

public class PlacedreamerSpeechlet implements SpeechletV2 {

	private static final Logger log = LoggerFactory.getLogger(PlacedreamerSpeechlet.class);
	private static final String TITLE = "Travel Stories";
	
	@Override
	public void onSessionStarted(SpeechletRequestEnvelope<SessionStartedRequest> requestEnvelope) {
	}

	@Override
	public SpeechletResponse onLaunch(SpeechletRequestEnvelope<LaunchRequest> requestEnvelope) {
		String speechText = "Welcome to Travel Stories. Simply say \"Travel Stories, describe a place\".";
		PlainTextOutputSpeech speech = createSpeechPhrase(speechText);
		SimpleCard alexaCard = createAlexaCard(TITLE, speechText);
		return SpeechletResponse.newTellResponse(speech, alexaCard);
	}

	@Override
	public SpeechletResponse onIntent(SpeechletRequestEnvelope<IntentRequest> requestEnvelope) {
		Intent intent = requestEnvelope.getRequest().getIntent();
		String intentName = (intent != null) ? intent.getName() : null;
		if ("DescribePlaceIntent".equals(intentName)) {
			return getSinglePlaceResponse();
		} else if ("AMAZON.CancelIntent".equals(intent.getName()) || "AMAZON.StopIntent".equals(intent.getName())) {
	        return getExitIntentResponse();
		} else if ("AMAZON.HelpIntent".equals(intent.getName())) {
	        return getHelpIntentResponse();
		} else {
			log.error("Intent {} not recognized for requestId {}", intentName, requestEnvelope.getRequest().getRequestId());
	  		throw new RuntimeException("Invalid Intent");
		}
	}

	private SpeechletResponse getHelpIntentResponse() {
		String speechText = "Travel Stories describes locations you might want to visit. Simply ask Travel Stories to describe a place.";
		SimpleCard card = createAlexaCard(TITLE, speechText);
		PlainTextOutputSpeech speech = createSpeechPhrase(speechText);
		return SpeechletResponse.newTellResponse(speech, card);
	}

	private SpeechletResponse getExitIntentResponse() {
		String speechText = "Good-Bye.";
		SimpleCard card = createAlexaCard(TITLE, speechText);
		PlainTextOutputSpeech speech = createSpeechPhrase(speechText);
		return SpeechletResponse.newTellResponse(speech, card);
	}

	@Override
	public void onSessionEnded(SpeechletRequestEnvelope<SessionEndedRequest> requestEnvelope) {
	}

	private SpeechletResponse getSinglePlaceResponse() {

		Placedreamer placedreamer = new Placedreamer();
		String speechText = placedreamer.getPlaceDescription();

		// Create the Simple card content.
		SimpleCard card = createAlexaCard(TITLE, speechText);
		PlainTextOutputSpeech speech = createSpeechPhrase(speechText);
		return SpeechletResponse.newTellResponse(speech, card);
	}

	private SimpleCard createAlexaCard(String title, String content) {
		SimpleCard card = new SimpleCard();
		card.setTitle(title);
		card.setContent(content);
		return card;
	}

	private PlainTextOutputSpeech createSpeechPhrase(String content) {
		PlainTextOutputSpeech speech = new PlainTextOutputSpeech();
		speech.setText(content);
		return speech;

	}
}
