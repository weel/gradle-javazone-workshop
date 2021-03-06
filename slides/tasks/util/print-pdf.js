/**
 * phantomjs script for printing presentations to PDF.
 *
 * Example:
 * phantomjs print-pdf.js "http://lab.hakim.se/reveal-js?print-pdf" reveal-demo.pdf
 *
 * By Manuel Bieh (https://github.com/manuelbieh)
 */

var page = new WebPage();
var system = require('system');

page.viewportSize  = {
  width: 1024,
  height: 768
};

page.paperSize = {
  format: 'letter',
  orientation: 'landscape',
  margin: {
    left: '0',
    right: '0',
    top: '0',
    bottom: '0'
  }
};

var source = system.args[1] || 'index.html?print-pdf';
var targetFile = system.args[2] || 'slides.pdf';

if (targetFile.match( /\.pdf$/gi ) === null) {
  targetFile += '.pdf';
}

page.open(source, function (status) {
  page.render(targetFile);
  console.log('Successfully created ' + targetFile);
  phantom.exit();
});

