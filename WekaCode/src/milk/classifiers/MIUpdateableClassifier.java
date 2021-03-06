/*
 *    This program is free software; you can redistribute it and/or modify
 *    it under the terms of the GNU General Public License as published by
 *    the Free Software Foundation; either version 2 of the License, or
 *    (at your option) any later version.
 *
 *    This program is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU General Public License for more details.
 *
 *    You should have received a copy of the GNU General Public License
 *    along with this program; if not, write to the Free Software
 *    Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 */

/*
 *    UpdateableClassifier.java
 *    Copyright (C) 1999 Eibe Frank
 *
 */
package milk.classifiers;
import milk.core.*;

import weka.classifiers.*;
import weka.core.*;

/**
 * Interface to incremental classification models that can learn using
 * one exemplar at a time.
 *
 * @author Eibe Frank (eibe@cs.waikato.ac.nz)
 * @author Xin Xu (xx5@cs.waikato.ac.nz)
 * @version $Revision: 1.1 $
 */
public interface MIUpdateableClassifier {
    
    /**
     * Updates a classifier using the given exemplar.
     *
     * @param example the exemplar to included
     * @exception Exception if instance could not be incorporated
     * successfully
     */
    void updateClassifier(Exemplar example) throws Exception;   
}

