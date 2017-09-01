
module.exports = {
  'globalAssertion': {
  	 whitelist: ['success']
  },

  'assertion_criteria': [
    {
      url: "/wls_prs_bkg/secured/booking/create",
      output: [{"fieldName": "data.id", "alias": "bookingNum"}]
    },

    {
      url: "/wls_prs_shv/secured/findShipments/search",
      output: [{"fieldName": "data.rows.0.containerNumber", "alias": "cms"}]
    },

    {
       url: "/wls_prs_doc/secured/blc/blCreation/create",
       output: [{"fieldName": "data.id", "alias": "bl"}]
    }

  ]
}



