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

public val LineAwesomeIcons.TvSolid: ImageVector
    get() {
        if (_tvSolid != null) {
            return _tvSolid!!
        }
        _tvSolid = Builder(name = "TvSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 7.0f)
                lineTo(2.0f, 23.0f)
                lineTo(30.0f, 23.0f)
                lineTo(30.0f, 7.0f)
                close()
                moveTo(4.0f, 9.0f)
                lineTo(28.0f, 9.0f)
                lineTo(28.0f, 21.0f)
                lineTo(4.0f, 21.0f)
                close()
                moveTo(10.0f, 24.0f)
                lineTo(10.0f, 26.0f)
                lineTo(22.0f, 26.0f)
                lineTo(22.0f, 24.0f)
                close()
            }
        }
        .build()
        return _tvSolid!!
    }

private var _tvSolid: ImageVector? = null
