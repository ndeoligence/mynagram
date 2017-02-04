package org.nodexy.mynagram

import java.util.logging.Logger

public class WordListFileImpl extends LinkedList<String> implements WordList {
    private static Logger log = Logger.anonymousLogger;
    WordListFileImpl() {
        Properties properties = new Properties()
        try {
            log.info 'Getting word list file location from properties file...'
            properties.load(new FileReader('src/main/resources/config.properties'))
            log.info 'Done!'
            loadWords properties.getProperty('wordlist.file.path')

        } catch (IOException e) {
            log.info 'Error loading properties file!'
            throw e
        }
    }
    WordListFileImpl(String filename) {
        loadWords filename
    }
    private void loadWords(String filename) {
        log.info "Caching word list from file $filename..."
        new File(filename).each {line -> add(line.toLowerCase())}
        log.info "Finished. Cached ${super.size()} words"
    }
}
