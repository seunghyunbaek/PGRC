package best.hyun.pgrc.type.berga

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Gorugoru : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_gorugoru)
    override val type: PET_TYPE
        get() = PET_TYPE.BERGA
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_gorugoru)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.FIRE
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.WIND
    override val mainElementalValue: Int
        get() = 80
    override val subElementalValue: Int
        get() = 20
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 40
    override val initLvMaxAtk: Int
        get() = 8
    override val initLvMaxDef: Int
        get() = 5
    override val initLvMaxSpd: Int
        get() = 7
    override val maxLvMaxHp: Int
        get() = 1353
    override val maxLvMaxAtk: Int
        get() = 298
    override val maxLvMaxDef: Int
        get() = 185
    override val maxLvMaxSpd: Int
        get() = 240
    override val initLvMinHp: Int
        get() = 30
    override val initLvMinAtk: Int
        get() = 7
    override val initLvMinDef: Int
        get() = 3
    override val initLvMinSpd: Int
        get() = 5
    override val maxLvMinHp: Int
        get() = 1129
    override val maxLvMinAtk: Int
        get() = 257
    override val maxLvMinDef: Int
        get() = 144
    override val maxLvMinSpd: Int
        get() = 207
    override val minAllGrowth: Double
        get() = 4.297
    override val maxAllGrowth: Double
        get() = 5.060
}