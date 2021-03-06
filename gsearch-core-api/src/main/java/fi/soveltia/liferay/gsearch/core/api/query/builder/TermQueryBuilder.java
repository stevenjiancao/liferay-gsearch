package fi.soveltia.liferay.gsearch.core.api.query.builder;

import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.search.Query;

import fi.soveltia.liferay.gsearch.core.api.query.QueryParams;

/**
 * Term query builder. 
 * 
 * Implementations of this interface parse a
 * term query from the configuration.
 * 
 * @author Petteri Karttunen
 */
public interface TermQueryBuilder {

	/**
	 * Build querystring query.
	 * 
	 * @param configurationObject
	 * @param queryParams
	 * @return Query object
	 * @throws Exception
	 */
	public Query buildQuery(
		JSONObject configurationObject, QueryParams queryParams)
		throws Exception;
}
