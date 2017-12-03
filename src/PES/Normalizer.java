package PES;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
* The method normalize() takes in the raw score and normalizes them.
* The normalized scores are returned as a Map with key as name and
* value as normalized score.
* */

public class Normalizer {
    Normalizer()
    {

    }

    Map<String,Float> normalize(Map<String,List<Integer>> rawScores)
    {
        Map<String, Float> result = new HashMap<String, Float>();
	float totalScore = 0;
	for (Map.Entry<String, List<Integer>> entry : scores.entrySet()) {
		float totalValue = 0;
		for (Integer score : entry.getValue()) {
			totalValue += score;
		}
		totalScore += totalValue;
		result.put(entry.getKey(), totalValue);
	}
	if (totalScore != 0) {
		for (Map.Entry<String, Float> entry : result.entrySet()) {
			result.put(entry.getKey(), entry.getValue() / totalScore);
		}
	}
	return result;
    }
}