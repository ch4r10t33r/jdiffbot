jdiffbot
========

Maven based Java Wrapper for the DiffBot API

<h3>Example of using this Wrapper</h3>
<pre>
<code>
		//Add your API token below
		String token = "<your api token goes here";
		//Add version of the API here
		int version = 2;
		//Add your list of fields below
		List fields = new ArrayList ();
		
		fields.add("*"); // '*' means return all fields.
		//fields.add("querystring");fields.add("date");
		
		JDiffBotWrapper theBot = JDiffBotWrapperFactory.getInstance();
		
		//Fetch the output as a JsonObject
		JsonObject jsonObject = theBot.diffBot(new URL("http://blog.diffbot.com/diffbots-new-product-api-teaches-robots-to-shop-online/"),
				token,JDiffBotWrapper.ARTICLE,fields,version);
		
		//Fetch the output as a JSON String
		String jsonString = theBot.diffBotAsString(new URL("http://blog.diffbot.com/diffbots-new-product-api-teaches-robots-to-shop-online/"),
				token,JDiffBotWrapper.ARTICLE,fields,version);
</code>
</pre>
