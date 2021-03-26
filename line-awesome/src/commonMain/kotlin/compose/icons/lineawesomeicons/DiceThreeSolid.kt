package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.DiceThreeSolid: ImageVector
    get() {
        if (_diceThreeSolid != null) {
            return _diceThreeSolid!!
        }
        _diceThreeSolid = Builder(name = "DiceThreeSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 27.0f)
                lineTo(27.0f, 27.0f)
                lineTo(27.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                close()
                moveTo(7.0f, 7.0f)
                lineTo(25.0f, 7.0f)
                lineTo(25.0f, 25.0f)
                lineTo(7.0f, 25.0f)
                lineTo(7.0f, 7.0f)
                close()
                moveTo(11.0f, 9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 11.0f, 13.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 11.0f, 9.0f)
                close()
                moveTo(16.0f, 14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 16.0f, 18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 16.0f, 14.0f)
                close()
                moveTo(21.0f, 19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 21.0f, 23.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 21.0f, 19.0f)
                close()
            }
        }
        .build()
        return _diceThreeSolid!!
    }

private var _diceThreeSolid: ImageVector? = null
