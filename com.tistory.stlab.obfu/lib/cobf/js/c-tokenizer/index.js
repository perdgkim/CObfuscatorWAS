var Tokenizer = require('tokenizer');

module.exports = function (cb) {
    var t = new Tokenizer(cb);

    t.addRule(/^\/\*([^*]|\*(?!\/))*\*\/$/, 'area comment');
    t.addRule(/^\/\*([^*]|\*(?!\/))*\*?$/, 'area comment continue');

    t.addRule(/^\/\/[^\n]*$/, 'line comment');
    t.addRule(/^"([^"\n]|\\")*"?$/, 'quote');
    t.addRule(/^'(\\?[^'\n]|\\')'?$/, 'char');
    t.addRule(/^'[^']*$/, 'char continue');

    t.addRule(/^#+( ?[a-zA-Z0-9]+.*)$/, 'directive');

    t.addRule(/^\($/, 'open paren');
    t.addRule(/^\)$/, 'close paren');
    t.addRule(/^\[$/, 'open square');
    t.addRule(/^\]$/, 'close square');
    t.addRule(/^{$/, 'open curly');
    t.addRule(/^}$/, 'close curly');

    t.addRule(
        /^(>=|<=|>>=|<<=|!=|[-<>~!%^&*\/+=?|.,:;]|::|(?<!:):(?!:)|->|<<|>>|\*\*|\|\||&&|--|\+\+|[-+*|&%\/=]=)$/,
        'operator'
    );

    t.addRule(/^([_A-Za-z]\w*)$/, 'identifier');

    t.addRule(/^(-?)\d*\.?\d*$/, 'number');
    t.addRule(/^(\s+)$/, 'whitespace');

    t.addRule(/^\\\n?$/, 'line continue');

    return t;
};
