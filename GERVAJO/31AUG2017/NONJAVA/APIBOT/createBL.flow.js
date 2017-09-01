const createBooking = {
    desc: 'Create Booking', 
    auth: {
    	qa1: {platform: 'IR4', user: 'PANPE4:Tuesday2'},
    	qa2: {platform: 'IR4', user: 'PANPE4:Tuesday2'},
        qa3: {platform: 'IR4', user: 'PANPE4:Tuesday2'}
    },
    type: 'HTTP', 
    spec: __dirname + '/createShp.http', 
    assertion: __dirname + '/http_assertion.js' 
}

const findShipment = {
    desc: 'Find Shipment', 
    auth: {
    	qa1: {platform: 'IR4', user: 'PANPE4:Tuesday2'},
    	qa2: {platform: 'IR4', user: 'PANPE4:Tuesday2'},
        qa3: {platform: 'IR4', user: 'PANPE4:Tuesday2'}
    },
    type: 'HTTP', 
    input: ['bookingNum'], 
    spec: __dirname + '/findShp.http', 
    assertion: __dirname + '/http_assertion.js' 
}

const createBL = {
    desc: 'Create Bill of Lading', 
    auth: {
    	qa1: {platform: 'IR4', user: 'PANPE4:Tuesday2'},
    	qa2: {platform: 'IR4', user: 'PANPE4:Tuesday2'},
        qa3: {platform: 'IR4', user: 'PANPE4:Tuesday2'}
    },
    type: 'HTTP', 
    input: ['bookingNum','cms'], 
    spec: __dirname + '/createBL.http', 
    assertion: __dirname + '/http_assertion.js' 
}

const selectBLIDfromDB = {

    desc: 'Get BL ID by BL num', 
    type: 'DB', 
    input: ['bl'], 
    sql: `select bill_of_lading_num from doc_bill_of_lading Where bill_of_lading_id = '{{bl}}'`,
    assertion: { 
        "output": [
            {
                "fieldName": "0.BILL_OF_LADING_NUM",
                "alias": "BL_NUM"
            }
        ]
    },
    connInfoList: {
        qa1: {
            connectString: 'hkir4qa1/ir4qa1.oocl',
            user: 'LODS_BPFW',
            password: 'LODS_BPFW'
        },
        qa3: {
            connectString: 'hkir4qa3/ir4qa3.oocl',
            user: 'LODS_BPFW',
            password: 'LODS_BPFW'
        }
    }
}

module.exports = {
    name: 'Create BL',
    //input: __dirname + '/dpmc.flow.data.json', //only support reusable data here, please specify a seperate file for non-reusable data
    steps: [
    	createBooking,
    	findShipment,
    	createBL,
    	selectBLIDfromDB
    ],
    output: ['bkg'],
    emails: ['john.adriel.gervacio@oocl.com','ryan.james.carreon@oocl.com']
}







