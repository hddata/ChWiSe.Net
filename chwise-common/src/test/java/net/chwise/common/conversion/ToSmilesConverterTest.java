/**
 Copyright (c) 2013 Alexander Savochkin
 Chemical wikipedia search (chwise.net) web-site source code

 This file is part of ChWiSe.Net infrastructure.

 ChWiSe.Net infrastructure is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package net.chwise.common.conversion;

import org.junit.Assert;
import org.junit.Test;

public class ToSmilesConverterTest {

    @Test
    public void testConvert1() throws Exception {
        String mol = "\n" +
                "  CDK     0000000000\n" + //Todo: This line almost always differs (contains time)
                "\n" +
                "  2  1  0  0  0  0  0  0  0  0999 V2000\n" +
                "    0.0000    0.0000    0.0000 C   0  0  0  0  0  0  0  0  0  0  0  0\n" +
                "    0.0000    1.5000    0.0000 O   0  0  0  0  0  0  0  0  0  0  0  0\n" +
                "  2  1  3  0  0  0  0 \n" +
                "M  CHG  1   1  -1\n" +
                "M  CHG  1   2   1\n" +
                "M  END\n";

        ToSmilesConverter converter = new ToSmilesConverter();
        String smiles = converter.convert(mol);

        Assert.assertEquals(smiles, "C#O");
    }
}
