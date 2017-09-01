const createBooking = {
    desc: 'Created booking number',
    auth: {
        qa1:{platform: 'IR4', user: 'bituiga:Tuesday2'}
    },
    type: 'HTTP',
    spec: __dirname + '/createBooking.http',
    assertion: __dirname + '/billLadingassertion.js'
}

/*const getCMS = {
    desc: 'Get booking number and cms',
    auth: {
        qa1:{platform: 'IR4', user: 'bituiga:Tuesday2'}
    },
    type: 'HTTP', 
    input: ['bkgNum'],
    spec: __dirname + '/getCMS.http',
    assertion: __dirname + '/billLadingassertion.js'
}*/

/*const createBl = {
    desc: 'Create Bill of Lading',
    input: 'bkgNum',
    auth: {
        qa1:{platform: 'IR4', user: 'bituiga:Tuesday2'}
    },
    type: 'HTTP', 
    spec: __dirname + '/createBL.http',
    assertion: __dirname + '/billLadingassertion.js'
}*/

module.exports = {
    name: 'Getting Bill of Lading',
    auth: {
        qa1:{platform: 'IR4', user: 'bituiga:Tuesday2'}
    },
    steps: [
        createBooking
    ],
    emails: ['katrina.burgos@oocl.com']
}
