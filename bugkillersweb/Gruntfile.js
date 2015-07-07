module.exports = function (grunt) {
    grunt.initConfig({
            pkg: grunt.file.readJSON('package.json'),
            jshint: {
                all: [
                    'Gruntfile.js',
                    'static/bugkillers/js/*.js'
                ],
                options: {
                    //"boss": true,
                    //"curly": true,
                    //"eqeqeq": true,
                    //"eqnull": true,
                    //"immed": true,
                    //"latedef": true,
                    //"newcap": true,
                    //"noarg": true,
                    //"node": true,
                    //"sub": true,
                    //"undef": true,
                    //"unused": true
                }
            },

            // Before generating any new files, remove any previously-created files.
            clean: {
                tests: [' static/bugkillers/lesscss']
            },

            // Configuration to be run (and then tested).
            less: {
                compile: {
                    options: {
                        paths: ['static/bugkillers/less']
                    },
                    files: {
                        'static/jstest/bugkillers/test.css': ['static/jstest/bugkillers/test.less'],
                    }
                }
            },
            watch: {
                scripts: {
                    files: ['static/bugkillers/js/*.js', 'Gruntfile.js'],
                    tasks: ['jshint']
                },
                less: {
                    files: ['static/bugkillers/less/*.less'],
                    tasks: ['less']
                }
            }
        }
    );
    //load plugins
    grunt.loadNpmTasks('grunt-contrib-jshint');
    grunt.loadNpmTasks('grunt-contrib-less');
    grunt.loadNpmTasks('grunt-contrib-clean');
    grunt.loadNpmTasks('grunt-contrib-internal');
    grunt.loadNpmTasks('grunt-contrib-watch');

    //registerTasks
    grunt.registerTask('bugkillers', ['jshint', 'clean', 'less', 'watch']);

    //registerTask on grunt then just run 'grunt',the task will run
    grunt.registerTask('default', ['bugkillers']);

};