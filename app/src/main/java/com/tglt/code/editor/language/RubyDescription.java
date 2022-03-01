/*
 *   Copyright 2020-2021 Rosemoe
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package com.tglt.code.editor.language;

import io.github.rosemoe.sora.langs.universal.LanguageDescription;

/**
 * @author Rose
 */
@SuppressWarnings("SpellCheckingInspection")
public class RubyDescription implements LanguageDescription {

    @Override
    public boolean isOperator(char[] characters, int length) {
        if (length == 1) {
            char c = characters[0];
            return (c == '+' || c == '-' || c == '{' || c == '}' || c == '[' || c == ']' ||
                    c == '(' || c == ')' || c == '|' || c == ':' || c == '.' || c == ',' ||
                    c == ';' || c == '*' || c == '/' || c == '&' || c == '^' || c == '%' ||
                    c == '!' || c == '~' || c == '<' || c == '>' || c == '=' || c == '\\' ||
                    c == '#');
        }
        return false;
    }

    @Override
    public boolean isLineCommentStart(char a, char b) {
        return a == '/' && b == '/';
    }

    @Override
    public boolean isLongCommentStart(char a, char b) {
        return a == '/' && b == '*';
    }

    @Override
    public boolean isLongCommentEnd(char a, char b) {
        return a == '*' && b == '/';
    }

    @Override
    public String[] getKeywords() {
        return new String[]{
                "alias", "and", "BEGIN", "begin", "break", "case", "catch", "class", "def",
                "defined?", "do", "else", "elsif", "END", "end", "ensure", "false",
                "for", "if", "in", "module", "next", "nil", "not", "or", "public",
                "private", "protected", "raise", "redo", "rescue", "retry", "return", "self",
                "super", "then", "throw", "true", "undef", "unless", "until", "when", "while",
                "yield", "self", "nil", "true", "false", "TRUE", "FALSE", "NIL"
        };
    }

    @Override
    public boolean useTab() {
        return false;
    }

    @Override
    public int getOperatorAdvance(String operator) {
        switch (operator) {
            case "{":
                return 4;
            case "}":
                return -4;
        }
        return 0;
    }

    @Override
    public boolean isSupportBlockLine() {
        return true;
    }

    @Override
    public boolean isBlockStart(String operator) {
        return operator.equals("{");
    }

    @Override
    public boolean isBlockEnd(String operator) {
        return operator.equals("}");
    }
}
