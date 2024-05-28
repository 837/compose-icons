package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.OctagonPlus2: ImageVector
    get() {
        if (_octagonPlus2 != null) {
            return _octagonPlus2!!
        }
        _octagonPlus2 = Builder(name = "OctagonPlus2", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.023f, 21.74f)
                lineToRelative(-0.221f, 0.095f)
                curveToRelative(-0.512f, 0.22f, -1.092f, 0.22f, -1.604f, 0.0f)
                lineToRelative(-5.575f, -2.389f)
                arcToRelative(2.036f, 2.036f, 0.0f, false, true, -1.07f, -1.07f)
                lineToRelative(-2.388f, -5.574f)
                arcToRelative(2.036f, 2.036f, 0.0f, false, true, 0.0f, -1.604f)
                lineToRelative(2.389f, -5.575f)
                curveToRelative(0.206f, -0.48f, 0.589f, -0.863f, 1.07f, -1.07f)
                lineToRelative(5.574f, -2.388f)
                arcToRelative(2.036f, 2.036f, 0.0f, false, true, 1.604f, 0.0f)
                lineToRelative(5.575f, 2.389f)
                curveToRelative(0.48f, 0.206f, 0.863f, 0.589f, 1.07f, 1.07f)
                lineToRelative(2.388f, 5.574f)
                curveToRelative(0.22f, 0.512f, 0.22f, 1.092f, 0.0f, 1.604f)
                lineToRelative(-0.081f, 0.19f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 19.0f)
                horizontalLineToRelative(6.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 16.0f)
                verticalLineToRelative(6.0f)
            }
        }
        .build()
        return _octagonPlus2!!
    }

private var _octagonPlus2: ImageVector? = null
