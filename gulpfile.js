const gulp = require('gulp');
const sonarqubeScanner = require('sonarqube-scanner');

gulp.task('sonar', function(callback) {
    sonarqubeScanner({
        serverUrl: "http://172.30.5.2:9000",
        options: {}
    }, callback);
});
