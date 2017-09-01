
module.exports = {
  'globalAssertion': {
  },

  'assertion_criteria': [
    {
      url: '/wls_prs_bkg/secured/booking/create',
      output: [{'fieldName':'data.id','alias':'bkgNum'}]
    }
    /*{
      url: '/wls_prs_shv/secured/findShipments/search',
      output: [{'fieldName':'data.id','alias':'bkgNum'},
                {'fieldName' : data.rows[0].containerNumber, 'alias' : 'containerNum'}]
    }
    /*{
      "url": "wls_prs_shv/secured/findShipments/search",
      //"whitelist": ["success"],
      output: [ {'fieldName':'data.id','alias':'bkgNum'},
                {'fieldName' : 'data.id', 'alias' : 'blNum'}]
    }*/
  ],
  inSequence: true
}


