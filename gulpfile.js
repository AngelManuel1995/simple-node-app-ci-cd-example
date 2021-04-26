const gulp = require('gulp');
const sonarqubeScanner = require('sonarqube-scanner');

gulp.task('sonar', function(callback) {
    sonarqubeScanner({
        serverUrl: "http://143.198.65.252/:9000",
        options: {}
    }, callback);
});
 

