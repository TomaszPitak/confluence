/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.xwiki.contrib.confluence.parser.confluence.internal.wikimodel;

import org.apache.commons.lang3.StringUtils;
import org.xwiki.rendering.wikimodel.IWikiReferenceParser;
import org.xwiki.rendering.wikimodel.WikiParameters;
import org.xwiki.rendering.wikimodel.WikiReference;

/**
 * @version $Id: 9026c6142d736be1e88b30b28e6c880321c617a3 $
 * @since 9.0
 * @see WikiReference
 */
public class ConfluenceWikiReferenceParser implements IWikiReferenceParser
{
    public WikiReference parse(String str)
    {
        str = str.trim();
        String[] array = StringUtils.split(str, '|');
        String link;
        String label;
        String tip;
        if (array.length == 0) {
            link = "";
            label = null;
            tip = null;            
        } else if (array.length == 1) {
            link = str;
            label = null;
            tip = null;
        } else {
            label = array[0].trim();
            link = array[1].trim();
            tip = (array.length > 2) ? array[2].trim() : null;
        }
        WikiParameters params = WikiParameters.EMPTY;
        if (tip != null) {
            params = params.addParameter("title", tip);
        }

        return new WikiReference(link, label, params);
    }
}