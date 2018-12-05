var rimraf = require('rimraf');
var fs = require('fs');

var path = '../../../target/classes/static';
var dist = './dist';

rimraf(path, function () {
    console.log(`Deleted ${path}`);
    fs.renameSync(dist, path)
    console.log(`Moved ${dist} to ${path}`)
});