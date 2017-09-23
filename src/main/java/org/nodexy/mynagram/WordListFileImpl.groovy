package org.nodexy.mynagram

import org.apache.commons.configuration2.Configuration
import org.apache.commons.configuration2.builder.fluent.Configurations
import org.apache.commons.configuration2.ex.ConfigurationException
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger


class WordListFileImpl extends LinkedList<String> implements WordList {
    private static Logger log = LogManager.getLogger(WordListFileImpl.class)
    int minWordLen

    WordListFileImpl() {
        this(null)
    }
    WordListFileImpl(String filename) {
        init(filename)
    }
    def init(String filename) {
        Configurations configs = new Configurations()
        try {
            log.info 'Getting properties file...'
            Configuration config = configs.properties(new File("config.properties"))
            log.info 'Done!'

            minWordLen = config.getInt("word.min.length", 3)
            log.info("min-word-length set to $minWordLen")
            if (filename == null || filename == "") {
                filename = config.getString("wordlist.file.path")
            }
            loadWords(filename)
            // this.eachWithIndex {x,i-> println("${i+1}) $x")}
        } catch (ConfigurationException e) {
            log.error('Error loading properties file!', e)
            throw e
        }
    }

    private void loadWords(String filename) {
        log.info "Caching word list from file: $filename"
        def count = 0
        new File(filename).each {line ->
            count++
            if (line.length() >= minWordLen) {
                add(line.toLowerCase())
            }
        }

        log.info "Done. Cached ${sprintf('%,d', super.size())}/${sprintf('%,d', count)} words"
    }
}
