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
package org.xwiki.contrib.confluence.filter;

import java.util.HashMap;
import java.util.Map;

/**
 * A mapping between two set of String values. Used for example to associated imported users with existing ones.
 * 
 * @version $Id$
 * @since 9.11
 */
public class Mapping extends HashMap<String, String>
{
    private static final long serialVersionUID = 1L;

    /**
     * The default constructor.
     */
    public Mapping()
    {
        
    }

    /**
     * @param map the map to copy
     */
    public Mapping(Map<String, String> map)
    {
        super(map);
    }
}
